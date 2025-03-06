# SpellCheck Project

## Proje Tanımı

Bu proje, bir yazım denetleyicisi (spell checker) uygulamasıdır. Kullanıcı tarafından girilen bir kelimenin doğru yazılıp yazılmadığını kontrol eder ve eğer yanlış yazılmışsa, doğru olabilecek alternatif öneriler sunar. Bu alternatifler, kelimenin çeşitli yaygın yazım hatalarına dayanarak oluşturulur. Bu hatalar şunlar olabilir:

- Komşu karakterlerin yer değiştirmesi (swapped characters)
- Karakter ekleme (inserted characters)
- Karakter silme (deleted characters)
- Karakter değiştirme (replaced characters)

## Kullanım

1. Projeyi yerel makinenize klonlayın.
2. `dictionary.txt` dosyasını projeye dahil edin. Bu dosya, doğru yazılmış kelimelerin bulunduğu bir sözlük dosyasıdır.
3. `TestSpellChecker` sınıfını çalıştırarak, kullanıcının girdiği kelimenin doğruluğunu kontrol edebilir ve önerilen düzeltmeleri görebilirsiniz.

### Adımlar:
1. Projeyi bilgisayarınıza klonlayın:
2. `TestSpellChecker.java` dosyasını çalıştırın:
```java
java TestSpellChecker
