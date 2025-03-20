# Kotlin Coroutines & Generic Calculator  

## Overview  
This project demonstrates the use of **Kotlin Coroutines** in an Android application to execute functions **sequentially and concurrently**. Additionally, it includes a **generic Calculator** and processing classes for multiplication and division using **Kotlin's generics**.  

---

## Project Structure  

The project consists of two main parts:  

### ** 1 Coroutine Execution**  
- Implements three functions using **coroutines**.  
- Executes them in **sequential order** (one after another with delays).  
- Executes them in **concurrent order** (all running simultaneously).  
- Uses **Dispatchers** for efficient coroutine execution.  
- Handles **errors properly** within coroutines.  

### ** 2 Generic Calculator**  

#### **Calculator Class**  
- Supports **addition and subtraction** with generic constraints (`T : Number`).  
- Provides a method to **get the stored value**.  

#### **MultiplicationProcessor**  
- Uses a generic `in T : Number` type parameter for **multiplication**.  

#### **DivisionProcessor**  
- Supports **division with error handling** (prevents **division by zero**).  

---

## How to Run  

1 **Clone the repository** or **download the project**.  
2 **Open it in Android Studio**.  
3 **Connect an Android device** or **use an emulator**.  
4 **Run the application**.  
5 Check the **Logcat output** in Android Studio with the tag **`CoroutineTest`** to see coroutine execution logs.  
6 Run the **Calculator functions** in a **Kotlin Playground** project to test **generic operations**.  

---
## Link of Generic Calculator Kotlin Playground 
https://pl.kotl.in/po0AhLz9Y

---
## Screenshot of Coroutine Execution
<img width="1440" alt="Coroutines" src="https://github.com/user-attachments/assets/1938f2cc-c672-476b-88b9-d785d873cc75" />


## Screenshot of Generic Calculator
<img width="1440" alt="Generics" src="https://github.com/user-attachments/assets/0c8e4ffd-619b-4408-870f-880275e1a90e" />
