# 06_first-integration
[Jest też dostępna polska wersja](README.pl.md)

1. Go to `BlockchainHashGeneratorTest` class and run all tests.
2. Both are the same test except, one of them is mocked and second isn't.
3. Compare time of executions. Do you see difference?
4. Then run single test located in `WeatherServiceTest` It passes, but did you notice strange time of execution? What if there was more tests like 200 or 300?

# Exercise
1. First thing you need to do is make simple measuring what how long time takes average execution of this test.
2. Now implement tests and logic of `WeatherAlarmNotifier` so it matches following requirements:
- if temperature is raising above 35 Celcius degree it means notifier should raise `SECOND_LEVEL` alarm
- if wind is blowing faster than 100 km/h it means notifier should raise `SECOND_LEVEL` alarm
- if rainfall is above 100 mm it means notifier should raise `THIRD_LEVEL` alarm
- if more than one above alarms occurs together, it means notifier should raise `FIRST_LEVEL` alarm
- for all other situations notifier should raise `ALL_OK` status
You can immediately get to point 3rd which can make your life way easier by mocking most of heavy services.
3. Now try to mock services, so it is easier to test and get faster test response times
4. Did you notice bad design in this approach? Do you have any ideas how this could be refactored, so you can avoid unecessary mocks and complexity?