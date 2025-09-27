package Sept16;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		        System.out.print("Enter size of array: ");
		        int size = sc.nextInt();
		        //create array
		        int[] arr = new int[size]; // array size from user
		        int n = 0; // number of elements actually inserted

		        int choice;
		        do {
		            System.out.println("\n=== ARRAY MENU ===");
		            System.out.println("1. Insert elements");
		            System.out.println("2. Display elements");
		            System.out.println("3. Search element");
		            System.out.println("4. Delete element");
		            System.out.println("5. Find Min & Max");
		            System.out.println("6. Remove Duplicates");
		            System.out.println("7. Exit");
		           
		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();

		            switch (choice) {
		         // Insert elements into array
		            
		                case 1:       
		                	System.out.print("Enter number of elements (<= " + size + "): ");
		                    n = sc.nextInt();
		                    if (n > size) {
		                        System.out.println("You can only enter up to " + size + " elements.");
		                        n = size;
		                    }
		                    System.out.print("Enter " + n + " elements:");
		                    for (int i = 0; i < n; i++) {
		                        arr[i] = sc.nextInt();
		                    }
		                    break;

		                case 2: // Display
		                    if (n == 0) {
		                        System.out.println("Array is empty.");
		                    } else {
		                        System.out.println("Array elements are:");
		                        for (int i = 0; i < n; i++) {
		                            System.out.print(arr[i] + " ");
		                        }
		                       System.out.println();
		                    }
		                    break;

		                case 3: // Search
		                    if (n == 0) {
		                        System.out.println("Array is empty.");
		                    } else {
		                        System.out.print("Enter element to search: ");
		                        int key = sc.nextInt();
		                        boolean found = false;
		                        for (int i = 0; i < n; i++) {
		                            if (arr[i] == key) {
		                                System.out.println(key + " found at position " + (i + 1));
		                                found = true;
		                                break;
		                            }
		                        }
		                        if (!found) {
		                            System.out.println("Element not found!");
		                        }
		                    }
		                    break;

		                case 4: // Delete
		                    if (n == 0) {
		                        System.out.println("Array is empty.");
		                    } else {
		                        System.out.print("Enter element to delete: ");
		                        int del = sc.nextInt();
		                        int pos = -1;
		                        for (int i = 0; i < n; i++) {
		                            if (arr[i] == del) {
		                                pos = i;
		                                break;
		                            }
		                        }
		                        if (pos != -1) {
		                            for (int i = pos; i < n - 1; i++) {
		                                arr[i] = arr[i + 1];
		                            }
		                            n--;
		                            System.out.println("Element deleted successfully.");
		                        } else {
		                            System.out.println("Element not found!");
		                        }
		                    }
		                    break;

		                case 5: // Min & Max
		                    if (n == 0) {
		                        System.out.println("Array is empty.");
		                    } else {
		                        int min = arr[0], max = arr[0];
		                        for (int i = 1; i < n; i++) {
		                            if (arr[i] < min) min = 
		                            		arr[i];
		                            if (arr[i] > max) max = arr[i];
		                        }
		                        System.out.println("Minimum = " + min);
		                        System.out.println("Maximum = " + max);
		                    }
		                    break;

		               

		                case 6: // Remove duplicates
		                    if (n == 0) {
		                        System.out.println("Array is empty.");
		                    } else {
		                        int newLength = 0;
		                        for (int i = 0; i < n; i++) {
		                            boolean duplicate = false;
		                            for (int j = 0; j < newLength; j++) {
		                                if (arr[i] == arr[j]) {
		                                    duplicate = true;
		                                    break;
		                                }
		                            }
		                            if (!duplicate) {
		                                arr[newLength] = arr[i];
		                                newLength++;
		                            }
		                        }
		                        n = newLength;
		                        System.out.println("Duplicates removed successfully!");
		                    }
		                    break;
		                case 7:
		                    System.out.println("Exiting program...");
		                    break;

		                default:
		                    System.out.println("Invalid choice!");
		            }
		        } while (choice != 7);

		        sc.close();
		    }
			
			
		
		

	}


