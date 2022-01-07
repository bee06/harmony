/*
 * Copyright (c) 2022/1/7 . All Rights Reserved.
 */
package com.harmony.app.financial.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;

import java.io.File;

/**
 * @author: z Date: 2022/1/7 Time: 18:32
 * @version: 1.0.0
 */
public class FundamentalAnalysis {

    public static void main(String[] args) {
        final FundamentalAnalysis fundamentalAnalysis = new FundamentalAnalysis();
        ExcelReaderBuilder readerBuilder = fundamentalAnalysis.read("");
    }

    public ExcelReaderBuilder read(String filePath) {
        return EasyExcel.read(new File(filePath));
    }
}
