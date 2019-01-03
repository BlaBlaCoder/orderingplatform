package com.ordering.platform.wallet.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordering.platform.domain.CRDBENUM;
import com.ordering.platform.domain.WalletRequestCr;
import com.ordering.platform.domain.WalletRequestDb;
import com.ordering.platform.domain.WalletResponse;
import com.ordering.platform.domain.WalletResponseBalance;
import com.ordering.platform.wallet.repository.Wallet;
import com.ordering.platform.wallet.repository.WalletRepository;

@Service
public class WalletServiceImpl implements WalletService{	
	@Autowired
	WalletRepository walletRepository;
	
	@Override
	public WalletResponse addMoneyToWallet(WalletRequestCr walletRequest) {
		Wallet walletValue = walletRepository.findById(walletRequest.getUserId()).get();
		if(walletValue==null) {
			walletValue = new Wallet();
		}
		walletValue.setAmount(walletValue.getAmount().subtract(walletRequest.getAmount()));
		walletValue.setOrderId(walletRequest.getOrderId());
		walletValue.setServiceType(walletRequest.getServiceType());
		walletValue.setId(walletRequest.getUserId());
		Wallet savedWalletObject = walletRepository.save(walletValue);
		WalletResponse walletResponse = new WalletResponse();
		walletResponse.setAmount(savedWalletObject.getAmount());
		walletResponse.setCreditDebit(CRDBENUM.CR.getVal());
		walletResponse.setUserId(savedWalletObject.getId());
		walletResponse.setOrderId(savedWalletObject.getOrderId());
		walletResponse.setServiceType(savedWalletObject.getServiceType());
		return walletResponse;
	}

	public WalletResponse payMoneyFromWallet(WalletRequestDb walletRequest,Integer rev) throws Throwable {
		Wallet walletValue = walletRepository.findById(walletRequest.getUserId()).get();
		BigDecimal subtractedValue = walletValue.getAmount().subtract(walletRequest.getAmount());
		if(walletValue!=null&& subtractedValue.compareTo(BigDecimal.ZERO)>0) {
			walletValue.setAmount(walletValue.getAmount().subtract(walletRequest.getAmount()));
			walletValue.setOrderId(walletRequest.getOrderId());
			walletValue.setServiceType(walletRequest.getServiceType());
			Wallet savedWalletObject = walletRepository.save(walletValue);
			Integer subtractExact = Math.subtractExact(savedWalletObject.getRevisionId(),walletValue.getRevisionId());
			Integer crDb=(subtractExact==1)?CRDBENUM.DB.getVal():null;
			
			if(crDb==null&&rev<5) {
				return payMoneyFromWallet(walletRequest,++rev);
			}else if(crDb!=null) {
				WalletResponse walletResponse = new WalletResponse();
				walletResponse.setAmount(savedWalletObject.getAmount());
				walletResponse.setCreditDebit(crDb);
				walletResponse.setUserId(savedWalletObject.getId());
				walletResponse.setOrderId(savedWalletObject.getOrderId());
				walletResponse.setServiceType(savedWalletObject.getServiceType());
				return walletResponse;
			}
			else {
				throw new Throwable("two many entity updation happening for id "+walletRequest.getUserId());
			}
			
		}else {
			throw new Throwable("add more money to your account "+subtractedValue);
		}
	}
	@Override
	public WalletResponse payMoneyFromWallet(WalletRequestDb walletRequest) throws Throwable {
		return payMoneyFromWallet(walletRequest,0);
	}
	@Override
	public WalletResponseBalance checkMoneyInWallet(Long userId) {
		Wallet walletObject = walletRepository.findById(userId).get();
		WalletResponseBalance walletResponse = new WalletResponseBalance();
		if(walletObject!=null) {
		walletResponse.setAmount(walletObject.getAmount());
		walletResponse.setUserId(walletObject.getId());
		}
		return walletResponse;
	}

}
