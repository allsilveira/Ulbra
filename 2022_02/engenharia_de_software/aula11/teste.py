from selenium import webdriver
from selenium.webdriver.common.by import By

#iniciar o navegador
driver = webdriver.Chrome()

#acessar a URl do Python
driver.get('https://www.python.org/')

#digitar texto "Python" no input
driver.find_element(By.CSS_SELECTOR, ('#id-search-field')).send_keys("Python")

#clicar no botão de submit
driver.find_element(By.CSS_SELECTOR, ('#submit')).click()

#encerrar o browser
driver.quit()