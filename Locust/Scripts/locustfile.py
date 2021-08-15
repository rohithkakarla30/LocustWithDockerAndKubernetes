from datetime import datetime
import random
import json
from locust import HttpUser, task, between

class QuickstartUser(HttpUser):
    wait_time = between(1, 5)

    @task
    def getUsers(self):
        self.client.get("/getAll")

    @task
    def addUsers(self):
        date = datetime.now()
        data = {
            "userId":"{0}".format(date.strftime("%s")),
            "name":"Rohith_{0}".format(random.randint(0, 1000)),
            "email":"R@gmail.com",
            "age":20
        }

        with self.client.post("/add", json.dumps(data),headers={"Content-Type": "application/json"}, catch_response=True) as response:
            if response.status_code == 200 :
                response.success()
            else:
                response.failure("{0}: {1}".format(response.status_code, "Failed to Execute"))
                response.close()

    