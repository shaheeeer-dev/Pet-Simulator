# 🐾 Pet Simulator (Java OOP Project)

A simple **Object-Oriented Programming (OOP)** based **virtual pet simulator** written in Java.  
The player can choose a pet, give it a name, and interact with it by feeding, sleeping, or playing.

---

## 📌 Features
- **Choose Your Pet:** Dog 🐶, Cat 🐱, Parrot 🦜, or Hamster 🐹
- **Name Your Pet:** Give your pet a unique name.
- **Stats System:** Hunger, Happiness, and Energy (values between 0 and 100).
- **Actions:**
  - Eat 🍖 → Reduces hunger, increases energy.
  - Sleep 😴 → Increases energy.
  - Play 🎮 → Increases happiness, reduces energy, increases hunger.
- **Pet-Specific Play Behavior:** Each pet type has its own fun play action message.

---

## 🛠️ OOP Concepts Used
- **Inheritance:** Dog, Cat, Parrot, and Hamster extend the base `Pet` class.
- **Encapsulation:** Pet stats are private with getters and setters.
- **Polymorphism:** Overridden `play()` method for each pet type.
- **Abstraction:** Common pet actions handled in base class.

---

# Gameplay Example
1. Dog 🐶
2. Cat 🐱
3. Parrot 🦜
4. Hamster 🐹
Choose your pet: 1
Name your pet: Bruno

Bruno's Status
Hunger: 50
Happiness: 50
Energy: 50
----------------------

What do you want to do?
1. Eat 🍖
2. Sleep 😴
3. Play 🎮
4. Quit 🚪

Choice: 3
Bruno is playing...
Dog is chasing a ball! 🐶

----------------------
# license
This project is open source and available under the MIT License.

----------------------
# Author
Muhammad Shaheer
📍 COMSATS University, BSE
