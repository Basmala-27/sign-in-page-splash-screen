# 📱 Sign Up Android App + Splash Screen

## Overview
This is a simple Android application built with **Kotlin** and **ConstraintLayout**.  

The app allows users to:
- Enter a username and password
- Confirm password
- Sign up (with validation)
- Open external links (Google, Twitter, Facebook)

---

## ✨ Features
- Custom **UI** using `ConstraintLayout`
- **EditText** fields with custom drawable background
- Password confirmation validation with Toast messages
- External links buttons:
  - Google
  - Twitter (X)
  - Facebook

---

## 🛠 Tech Stack
- **Language:** Kotlin  
- **IDE:** Android Studio  
- **UI:** XML Layout + ViewBinding  

---

## Project Structure

- **activity_main.xml** – Defines the UI layout (ImageView, TextViews, EditTexts, Buttons)
- **MainActivity.kt** – Handles:
  - Button click listeners
  - Password validation
  - Opening URLs with `Intent`

---

## 📷 Screens

<img width="392" height="822" alt="image" src="https://github.com/user-attachments/assets/2f9e645e-f8a3-487f-89dc-da7836bef3dd" />
<img width="277" height="591" alt="image" src="https://github.com/user-attachments/assets/433409f2-d236-4ad8-b524-d3a48a73e534" />


---


## 🚀 How It Works
1. User enters:
   - Username
   - Password
   - Confirm Password
2. Click **Sign Up**:
   - If passwords don’t match → Show a Toast message
3. Click on social buttons:
   - Opens the respective website in the browser

---

## Future Improvements
- Add Firebase Authentication
- Add advanced form validations (email format, password strength)
- Enhance UI with Material Design components

---

## Author
Developed by **Basmala Mohamed**
