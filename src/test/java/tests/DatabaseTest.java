package tests;


import org.testng.Assert;

import org.testng.annotations.Test;


import utils.DBUtils;



public class DatabaseTest {



@Test
public void validateUserData(){



    String actualName =
            DBUtils.getUserName(1);



    String expectedName =
            "Periyasamy";



    Assert.assertEquals(
            actualName,
            expectedName);



}


}
