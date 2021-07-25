import sys
from py_currency_converter import convert

currencyValue = int(sys.argv[1])
fromCurrency = sys.argv[2]
toCurrency = sys.argv[3]

output = str(convert(base=fromCurrency, amount=currencyValue, to=[toCurrency,]))
print(output[8:len(output)-1])
