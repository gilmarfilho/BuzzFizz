package game;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gilmar-Filho on 04/10/2017.
 */
public class HostTest {
    Host host = new Host();

    @Test
    public void testFizz1(){
        Assert.assertTrue(host.play(3) == "fizz");
    }

    @Test
    public void testFizz2(){
        Assert.assertTrue(host.play(6) == "fizz");
    }

    @Test
    public void testBuzz1(){
        Assert.assertTrue(host.play(5) == "buzz");
    }

    @Test
    public void testBuzz2(){
        Assert.assertTrue(host.play(10) == "buzz");
    }

    @Test
    public void testBuzz3(){
        Assert.assertTrue(host.play(20) == "buzz");
    }

    @Test
    public void testBuzzFizz1(){
        Assert.assertTrue(host.play(15) == "fizz buzz");
    }

    @Test
    public void testBuzzFizz2(){
        Assert.assertTrue(host.play(30) == "fizz buzz");
    }

    @Test
    public void testBuzzFizz3(){
        Assert.assertTrue(host.play(45) == "fizz buzz");
    }

    @Test
    public void testNotAll1(){
        Assert.assertTrue(host.play(7) == "7");
    }

    @Test
    public void testNotAll2(){
        Assert.assertTrue(host.play(13) == "13");
    }

    @Test
    public void testNotAll3(){
        Assert.assertTrue(host.play(18) == "18");
    }
}
