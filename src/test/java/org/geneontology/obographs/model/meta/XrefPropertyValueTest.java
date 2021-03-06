package org.geneontology.obographs.model.meta;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class XrefPropertyValueTest {

    public static String val = "ICD10:111";
    public static String lbl = "foo disease";
    
    @Test
    public void test() {
        XrefPropertyValue spv = build();
        testSyn(spv);
    }

    public void testSyn(XrefPropertyValue spv) {
        assertEquals(val, spv.getVal());
    }

    public static XrefPropertyValue build() {
        return new XrefPropertyValue.Builder().val(val).
                lbl(lbl).
                build();
    }

}
