# 🎮 Text-Based RPG – Java Console Project

## 🧠 Overview

This project is a **Java console-based role-playing game (RPG)** that allows the player to create a custom character by choosing both a **race** (Human, Elf, Dwarf, etc.) and a **job/class** (Warrior, Mage, Dark Mage, etc.).

Combat is handled through a **turn-based system**, with player choices such as attacking, defending, and using skills, directly affecting the outcome of the fight.

> 🎯 This project is part of my personal learning journey. It helps me strengthen my object-oriented programming skills in Java by applying key concepts in a fun and concrete way.

---

## 📚 Learning Goals

This project allows me to practice and deepen my understanding of:

- ✅ **Inheritance** and **polymorphism**
- ✅ **Abstract classes** and **interfaces**
- ✅ **Encapsulation** and access modifiers (`private`, `protected`, etc.)
- ✅ The **Factory Design Pattern** for dynamic character creation
- ✅ Designing and managing **game state** (HP, turns, statuses, etc.)
- ✅ Console-based interaction through **text prompts and decision menus**
- ✅ Clean, **modular, and scalable architecture**

---

## 🏗️ Project Structure

Here is a simplified view of the current architecture of the codebase:

```plaintext
┌────────────────────────────┐
│        Player Input        │
│  (chooses race and job)    │
└────────────┬───────────────┘
             │
             ▼
   ┌────────────────────┐
   │  CharacterFactory   │  ← Creates character from race + job
   └─────────┬──────────┘
             ▼
   ┌────────────────────┐
   │     Humanoide      │  ← Abstract base class (HP, stats, actions)
   └────┬────┬────┬─────┘
        │    │    │
        ▼    ▼    ▼
     Human  Elf  Dwarf        ← Races (inherit from Humanoide)

             │
             ▼
   ┌────────────────────┐
   │       Job          │  ← Warrior, Mage, Dark Mage...
   └────────────────────┘

   (Races + Jobs define stats and abilities)

             │
             ▼
   ┌────────────────────┐
   │   BattleManager     │  ← Handles turn-by-turn logic, combat flow
   └────────────────────┘

   ┌────────────────────┐
   │    GamePrompt       │  ← Displays menus & reads player input
   └────────────────────┘
```

---

## 🚧 Project Status

This project is currently **in active development**.

The main features I'm working on include:

- 🧱 Turn-by-turn combat engine
- 🧙 Job-specific abilities and special effects
- 🧪 Combat feedback through the console
- 🧠 AI-controlled opponents
- 📈 Character progression (experience, leveling)

It is **not yet a finished game**, but a **learning playground** to help me improve my technical skills and explore game architecture in Java.

---

## 💬 Open to Feedback & Improvement

I’m always looking to improve and learn — if you have ideas, suggestions, or feedback, feel free to reach out or open an issue!

> All feedback is welcome, whether technical, design-related, or structural.  
> I’m building this project step by step, and any input can help make it better.

---

## 📅 Last Updated

> Project started in 2025 — ongoing development 🚧
