# Lista Avaliativa II (Padrões de Projeto)

## Questão 3 – Pagamentos (Padrão Adapter)

### Enunciado resumido
O sistema usa um provedor antigo de pagamentos (`MPay`), mas a empresa migrou para um novo provedor (`PPay`).  
As interfaces são incompatíveis e não é possível alterar as 100 classes existentes que usam `MPay`.

Aplicar o padrão **Adapter** para permitir que objetos `MPay` funcionem como `PPay`.

### Objetivo
Ilustrar o uso do padrão **Adapter**, convertendo a interface antiga em uma nova interface sem modificar o código já existente.

### Como executar
1. Coloque os arquivos Java dentro de `src/`
2. Compile:
   ```bash
   javac *.java
   ```
3. Execute:
   ```bash
   java Main
   ```
