import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public final class TrianguloDePascal {

private TrianguloDePascal() { }

/** * Gera o Triângulo de Pascal de forma <b>iterativa</b>. * * @param nLinhas número de linhas a gerar (≥ 0) * @return lista de linhas, onde cada linha é uma lista de {@code Long} * @throws IllegalArgumentException se {@code nLinhas < 0} */ public static List<List<Long>> pascalIterativo(int nLinhas) {
if (nLinhas < 0) {
throw new IllegalArgumentException("nLinhas deve ser >= 0");
}
List<List<Long>> tri = new ArrayList<>(nLinhas);
for (int i = 0; i < nLinhas; i++) {
if (i == 0) {
tri.add(Arrays.asList(1L));
} else {
tri.add(proximaLinha(tri.get(i - 1)));
}
}
return tri;
}

/** * Gera o Triângulo de Pascal de forma <b>recursiva simples</b>, construindo * cada linha a partir da anterior até alcançar {@code nLinhas}. * * * @param nLinhas número de linhas a gerar (≥ 0) * @return lista de linhas, onde cada linha é uma lista de {@code Long} * @throws IllegalArgumentException se {@code nLinhas < 0} */ public static List<List<Long>> pascalRecursivo(int nLinhas) {
if (nLinhas < 0) {
throw new IllegalArgumentException("nLinhas deve ser >= 0");
}
List<List<Long>> tri = new ArrayList<>(nLinhas);
preencherRecursivo(nLinhas, tri);
return tri;
}


private static List<Long> proximaLinha(List<Long> anterior) {
int n = anterior.size();
List<Long> atual = new ArrayList<>(n + 1);
atual.add(1L);
for (int i = 1; i < n; i++) {
atual.add(anterior.get(i - 1) + anterior.get(i));
}
atual.add(1L);
return atual;
}

private static void preencherRecursivo(int alvo, List<List<Long>> acumulado) {
if (acumulado.size() == alvo) return;
if (acumulado.isEmpty()) {
acumulado.add(Arrays.asList(1L));
} else {
List<Long> ultima = acumulado.get(acumulado.size() - 1);
acumulado.add(proximaLinha(ultima));
}
preencherRecursivo(alvo, acumulado);
}

public static void main(String[] args) {
int n = 5;
System.out.println("Iterativo : " + pascalIterativo(n));
System.out.println("Recursivo : " + pascalRecursivo(n));
}
}