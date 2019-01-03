package com.ordering.platform.wallet.service;

import com.ordering.platform.domain.WalletRequestCr;
import com.ordering.platform.domain.WalletRequestDb;
import com.ordering.platform.domain.WalletResponse;
import com.ordering.platform.domain.WalletResponseBalance;

public interface WalletService {
	
	WalletResponse addMoneyToWallet(WalletRequestCr walletRequest);

	WalletResponse payMoneyFromWallet(WalletRequestDb walletRequest) throws Throwable;
	WalletResponseBalance checkMoneyInWallet(Long userId);

}
