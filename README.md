### Teste da groovy com quarkus

Testa a extensão quarkus-groovy a parti do código fonte dela. Se for testar a extensão a parti do maven central
vários passos abaixo não serão necessário

1. git clone https://github.com/quarkiverse/quarkus-groovy
2. cd quarkus-groovy
3. mvn clean install -DskipTests
4. Cria um projeto novo com quarkus 3
5. adicona a dependência  =>  implementation 'io.quarkiverse.groovy:quarkus-groovy:999-SNAPSHOT'
6. adiciona o plugin =>  id 'groovy'
7. cria o diretorio src/main/groovy
8. Pronto

 