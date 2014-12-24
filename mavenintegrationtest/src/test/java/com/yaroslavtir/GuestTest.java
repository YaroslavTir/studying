package com.yaroslavtir;

import junit.framework.Assert;
import org.junit.Test;

/**
 * @author YMolodkov
 * @since 16.0
 */
public class GuestTest {
    @Test
    public void testRetrieveName() throws Exception {
        Guest guest = new Guest();
        Assert.assertEquals("Bender Ivanov", guest.retrieveName("Ivanov"));
    }
}
