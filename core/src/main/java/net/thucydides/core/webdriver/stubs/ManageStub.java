package net.thucydides.core.webdriver.stubs;

import com.beust.jcommander.internal.Sets;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.Logs;

import java.util.Set;

/**
 * Created by john on 2/02/15.
 */
public class ManageStub implements WebDriver.Options {
    @Override
    public void addCookie(Cookie cookie) {

    }

    @Override
    public void deleteCookieNamed(String s) {

    }

    @Override
    public void deleteCookie(Cookie cookie) {

    }

    @Override
    public void deleteAllCookies() {

    }

    @Override
    public Set<Cookie> getCookies() {
        return Sets.newHashSet();
    }

    @Override
    public Cookie getCookieNamed(String s) {
        return null;
    }

    @Override
    public WebDriver.Timeouts timeouts() {
        return new TimeoutsStub();
    }

    @Override
    public WebDriver.ImeHandler ime() {
        return null;
    }

    @Override
    public WebDriver.Window window() {
        return new WindowStub();
    }

    @Override
    public Logs logs() {
        return null;
    }
}