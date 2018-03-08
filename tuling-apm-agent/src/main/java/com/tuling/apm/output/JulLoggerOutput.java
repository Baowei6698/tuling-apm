package com.tuling.apm.output;

import com.tuling.apm.IOutput;

import java.util.logging.Logger;

/**
 * Created by Tommy on 2018/3/8.
 */
public class JulLoggerOutput implements IOutput {
    static Logger logger = Logger.getLogger(JulLoggerOutput.class.getName());

    @Override
    public boolean out(Object value) {
        logger.info(value.toString());
        return true;
    }
}
