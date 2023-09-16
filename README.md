# diagrama-iphone
Desafio de Projeto do Bootcamp Desenvolvimento Java com Cloud AWS, fornecido pela [DIO](https://web.dio.me/), o qual envolve a criação de um diagrama de classes UML básico de alguns componentes do iPhone.

```plantuml
@startuml Diagrama de Classes Iphone

title "Diagrama de Classes Iphone"

class iPhone

interface reprodutorMusical {
    +tocar() : void
    +pausar() : void
    +selecionarMusica() : void
}
interface aparelhoTelefonico {
    +ligar() : void
    +atender() : void
    +iniciarCorreioVoz() : void
}
interface navegadorInternet {
    +exibirPagina() : void
    +adicionarNovaAba() : void
    +atualizarPagina() : void
}

class reprodutorMusicalImpl {
    +tocar() : void
    +pausar() : void
    +selecionarMusica() : void
}
class aparelhoTelefonicoImpl {
    +ligar() : void
    +atender() : void
    +iniciarCorreioVoz() : void
}
class navegadorInternetImpl {
    +exibirPagina() : void
    +adicionarNovaAba() : void
    +atualizarPagina() : void
}

iPhone <|-down- reprodutorMusicalImpl
iPhone <|-down- aparelhoTelefonicoImpl
iPhone <|-down- navegadorInternetImpl
reprodutorMusical <|.up. reprodutorMusicalImpl
aparelhoTelefonico <|.up. aparelhoTelefonicoImpl
navegadorInternet <|.up. navegadorInternetImpl

@enduml
```
