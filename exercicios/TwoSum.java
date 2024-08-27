import java.util.HashMap;
import java.util.Map;
/*
 * Two Sum
 * 
 * Dada uma matriz de números inteiros e um alvo inteiro, retorne os índices dos dois números de forma que eles somem ao alvo.
 * Você pode assumir que cada entrada teria exatamente uma solução e não pode usar o mesmo elemento duas vezes.
 * Você pode retornar a resposta em qualquer ordem.
 * 
 *   Example 1:
 * Input: nums = [2,7,11,15], target = 9 
 * Output: [0,1] // o valor na posição 0 e o valor na posição 1 retorna o target 9
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * 
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * Hint:
 * 
 * # Uma maneira realmente de força bruta seria procurar todos os pares de números possíveis, mas isso seria muito lento. Novamente, é melhor experimentar soluções de força bruta apenas para completar. É a partir dessas soluções de força bruta que você pode criar otimizações.
 * # Portanto, se fixarmos um dos números, digamos x, teremos que varrer todo o array para encontrar o próximo número y, que é valor - x, onde valor é o parâmetro de entrada. Podemos mudar nosso array de alguma forma para que essa busca se torne mais rápida?
 * # A segunda linha de pensamento é: sem alterar a matriz, podemos usar espaço adicional de alguma forma? Como talvez um mapa hash para acelerar a pesquisa?
 * 
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		// Primeiro pensamento para a solução seria pegar o primeiro numero do array e somar com os outros para verificar se tenho o valor de target
		// Se eu inverter o array [15,11,7,2] a logica seria pegar o primeiro valor e passar por todo o array, só que teria um problema sendo a necessidade de passar por todo array
		// Melhor solução seria eu pegar o target que é 9 menos o primeiro valor 9 - 2 = 7 se eu tiver este valor 7 no array, seria ele o valor que preciso, porém ainda assim ele passaria por todo array,
		// neste caso a melhor estrutura de dados seria o hash map
		
		
		Map<Integer,Integer> map = new HashMap(); // criando hashmap para salvar os valores do array
		int[] output = new int[2]; // criando um array de saida de tamanho 2 para comportar a solução [0,1]

        // iterando pelo array para verificar se eu tenho o valor referente a subtração do target para o número que eu estou (9-2 = 7)
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){ // verificando se dentro do meu map contem o valor que estou procurando
                output[0] = map.get(nums[i]); // se contem o valor, preencha o array de output para retornar
                output[1] = i;
                return output;
            } 
            // targe sendo 9, nums sendo 2, e [i] sendo o 7, i seria o indice de onde o valor foi encontrado para eu saber em qual posição ele estava
            map.put(target - nums[i], i); // caso não encontre irei preencher o map com o valor 7, e o ultimo i sendo a posição atual
        }
        return null;
	}

}













