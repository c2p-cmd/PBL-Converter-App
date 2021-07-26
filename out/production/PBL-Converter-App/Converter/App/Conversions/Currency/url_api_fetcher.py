import requests

fromC = 'GBP'
# Where currency is the base currency you want to use
url = 'https://api.exchangerate-api.com/v4/latest/'+fromC

# Making our request
response = requests.get(url)
data = response.json()

# Your JSON object
#print(data)
#print(f"Type: {type(data['rates'])}")

toC = 'INR'
rate = data['rates']
res = rate[toC]
print(f"\nData[{toC}]: {res}")