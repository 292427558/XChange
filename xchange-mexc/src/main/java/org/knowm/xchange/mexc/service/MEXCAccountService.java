package org.knowm.xchange.mexc.service;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.mexc.MEXCExchange;
import org.knowm.xchange.service.account.AccountService;

public class MEXCAccountService extends MEXCAccountServiceRaw implements AccountService {

  public MEXCAccountService(Exchange exchange) {
    super(exchange);
  }
}
