package com.baiju.java.instrument.example.transform;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Alipay.com Inc.
 * Copyright (c) 2005-2017 All Rights Reserved.
 */
public class AgentTest {
    @Test
    public void premain() throws Exception {
        Sleeping sleeping = new Sleeping();
        sleeping.ransomSleep();
    }
}
