package com.example.demo.config.pay;

import com.alipay.api.AlipayApiException;
import com.example.demo.entity.AlipayBean;

public interface PayService {

    /**
     * 支付宝支付接口
     * @param alipayBean
     * @return
     * @throws AlipayApiException
     */
    String aliPay(AlipayBean alipayBean) throws AlipayApiException;

}
