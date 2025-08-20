from appium.options.android import UiAutomator2Options
from appium import webdriver

desired_caps = {
    # tus capabilities antiguas, si las tienes
}

options = UiAutomator2Options()
# Ahora, en lugar de usar desired_caps, configuras el objeto options:
# Por ejemplo:
options.platform_name = "Android"
options.device_name = "emulator-5554"
options.app = "/path/to/your/app.apk"
# O si tienes desired_caps, puedes pasarlos al options:
# options.set_capability("capability_name", "value")

driver = webdriver.Remote("http://localhost:4723/wd/hub", options=options)
