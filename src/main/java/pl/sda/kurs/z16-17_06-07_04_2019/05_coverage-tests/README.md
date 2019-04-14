# 05_coverage-tests
[Jest też dostępna polska wersja](README.pl.md)

Have you ever heard of Latte Factor? Here is couple links explaining this term:
* [https://www.modestmoney.com/the-latte-factor/1283](https://www.modestmoney.com/the-latte-factor/1283)
* [https://www.forbes.com/sites/robertberger/2017/05/27/the-latte-factor-7-key-lessons-we-can-learn-from-a-cup-of-coffee/](https://www.forbes.com/sites/robertberger/2017/05/27/the-latte-factor-7-key-lessons-we-can-learn-from-a-cup-of-coffee/)

TLDR: `Latte Factor - (economics) The phenomenon whereby many small purchases add up to a significant expenditure over time.`

Run existing test with coverage option located inside `MoneySavingCalculatorTest`.
All test should pass and you should notice 100% coverage.

# Exercise

1. Try to implement rest of `SavingFrequency` values so it calculates right values and keeps 100% coverage.
2. For example, here is one of the scenario, which should be covered during this exercise:
```
If I am saving 1.23 PLN each day for next 138 days, I should save `169.74 PLN`
If I am saving 2 PLN each week for next 100 days, I should save `28 PLN` 
and so on...
```
3. More advance version should allow to estimate savings in long term based on ROI percentage value. Assume it is ROI value assigned to given period:
Example:
```
John is saving 100$ each month instead spending it on cigaretes and invest it with ROI equal to 1%/month 
How much money do he get after 5 years?
1 month - he puts 100$ on account
2 month - he gets 101$ from first month and puts another 100$ on account, so he has 201$ for now
3 month - he gets 203,01$ from previous months and puts another 100$, so now he has 303,01$
4 month - he gets 306,04$ from previous months and puts another 100$, so now he has 406,04$
5 month - he gets 410,10$ from previous months and puts another 100$, so now he has 510,10$
...
60 month - he gets 8248,63$ from previous months and puts another 100$, so now he has 8348,63$
```

