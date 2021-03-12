package com.example.demo.CONTROLLER;

import com.alipay.api.AlipayApiException;
import com.example.demo.config.pay.PayService;
import com.example.demo.entity.AlipayBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("order")
public class OrderController {

    @Autowired
    private PayService payService;

    @RequestMapping(value = "alipay")
    public String alipay(String outTradeNo, String subject, String totalAmount, String body) throws AlipayApiException {
        AlipayBean alipayBean = new AlipayBean();
        alipayBean.setOut_trade_no(outTradeNo);
        alipayBean.setSubject(subject);
        alipayBean.setTotal_amount(totalAmount);
        alipayBean.setBody(body);
        return payService.aliPay(alipayBean);
    }

    //支付成功支付宝调用方法：
    @RequestMapping(value = "ok")
    public void ok(){
        System.out.println("付款成功！");
    }
}

