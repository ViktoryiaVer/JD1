Задания и классы:

2.1-2.2. пакет textOperations: api: интерфейсы ICollectionHandler, IStringHandler
                               comparator: классы ListComparatorByKey, ListComparatorByValue
                               supplier: класс StringFromFileSupplier, StringFromFileSupplierBufferedReader
                               core: классы MapHandler, SetStringHandler, TextHandler
пакет runners: класс с точкой входа TextHandlerMain

3. пакет searchEngines:        api: интерфейс ISearchEngine

4.1-4.5 пакет searchEngines:   классы EasySearch, RegExSearch, SearchEnginePunctuationNormalizer, SearchEngineCaseInsensitive,
                               SearchEngineCaseNormalizer

5. пакет runners: класс с точкой входа SearchMain

6. пакет test: классы EasySearchTest, RegExSearchTest, SearchEnginePunctuationNormalizerTest, SearchEngineCaseInsensitiveTest,
               SearchEngineCaseNormalizerTest

7. пакет fileOperations:       класс FileService
пакет runners: класс с точкой входа FileMain

_____________
книги и файлы: пакет resources пакет watAndPeace: fragment.txt, Война и мир_книга.txt
                               пакет books_txt:  100 книг в формате txt
