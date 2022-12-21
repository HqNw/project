
import json

with open("data.json", "r") as f:
    data = json.load(f)

    formated_data = json.dumps(data, indent=2)

print(formated_data)
