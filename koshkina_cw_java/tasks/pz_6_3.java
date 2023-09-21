//import java.util.Scanner;
//
///*
//Максимальная сумма
//Дан зубчатый двумерный массив. Необходимо определить номер строки с максимальной суммой, максимальную сумму и саму
//строку, которая даёт эту сумму.
//Вводится число n - количество строк зубчатого массива. Затем информация вводится следующими блоками:
//число k - количество элементов в строке и потом k элементов.
//Выведите на экран номер строки с максимальной суммой, на следующей строке – максимальную сумму,
// на следующей строчке выведите саму строку, которая даёт эту сумму.
//Пример.
//Ввод:					                Вывод:
//4 (n – кол-во строк)		        	1
//3 (k – кол-во элементов в строке)   	18
//1 8 9 (строка)			            	1 8 9
//5 (k – кол-во элементов в строке)
//1 -2 3 6 4 (строка)
//6 (k – кол-во элементов в строке)
//1 1 1 1 1 1 (строка)
//3 (k – кол-во элементов в строке)
//-1 2 5 (строка)
//
//*/


import java.util.Scanner;
 public class pz_6_3{
     public static void main(String[] args) {
                 Scanner s = new Scanner(System.in);
                 int n = s.nextInt();
                 int sum1 = 0, sum2 = 0, p = 0;
                 int [][]a = new int [n][];
                 for(int i=0; i < n; i++){
                     System.out.print("Введите количество элементов " + (i+1) + " строки: ");
                     int k = s.nextInt();
                     a[i] = new int [k];
                     for(int j=0; j < k; j++){
                         a[i][j] = s.nextInt();
                         sum1+=a[i][j];
                     }
                     if(sum1 > sum2){
                         sum2 = sum1;
                         sum1 = 0;
                         p = i;
                     }
                     else
                         sum1 = 0;
                 }

                 for(int i = 0; i < n; i++){
                     for(int j = 0; j < a[i].length; j++){
                         System.out.print(a[i][j] + " ");
                     }
                     System.out.print("\n");
                 }
                 System.out.print("Строка номер " + (p + 1) + "\nМаксимальная сумма: " + sum2 + "\nСтрока: ");
                 for(int i = 0; i < n; i++){
                     if (i == p){
                         for(int j=0; j < a[i].length; j++) {
                     System.out.print(a[i][j] + " ");
                     }
                     }
                 }
         }
 }