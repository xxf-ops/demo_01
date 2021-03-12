package com.example.demo.config.pay;

import com.alipay.api.AlipayApiException;
import com.example.demo.entity.AlipayBean;
import com.example.demo.function.Alipay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private Alipay alipay;

    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
        return alipay.pay(alipayBean);
    }

}

