package Hooks;

import Base.base;
import org.junit.After;
import org.junit.Before;

public class hooks extends  base{

    @Before
    public void setUp() {
       initializeBrowser();
    }
    @After
    public void tearDown() {
        quitbrowser();

    }
}
