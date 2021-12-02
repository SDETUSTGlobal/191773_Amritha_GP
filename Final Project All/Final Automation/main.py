

from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys
print("test case started")
#open Google Chrome browser
driver = webdriver.Chrome("D://chromedriver_win32 (1) 2//chromedriver.exe")
#maximize the window size
driver.maximize_window()
#delete the cookies
driver.delete_all_cookies()
#navigate to the url
driver.get("http://127.0.0.1:5000/")
#identify the user name text box and enter the value
driver.find_element_by_id("name").send_keys("Amritha")
time.sleep(2)
driver.find_element_by_name("b").send_keys("191773")
time.sleep(2)
driver.find_element_by_xpath("/html/body/form/center/input[3]").send_keys("UST Global")
time.sleep(2)
driver.find_element_by_id("email").send_keys("abcd@gmail.com")
time.sleep(2)
driver.find_element_by_id("submit").click()
time.sleep(2)
driver.close()
print("successfully completed")