# 🟩 popText - Libarary for jetpack compose 

**popText** is a Jetpack Compose UI component library built with a pixel-art style inspired by retro games like Minecraft. It includes uniquely styled composables like `PixelButton`, `PixelAlertDialog`, `MinecraftPixelCard`, and more. Designed for nostalgic apps, indie games, or playful UIs.

> ✨ Pixel-perfect components for Jetpack Compose.
> ✨ Latest Version - 1.0.8
---

## 📦 Features

- 🎮 Pixel-style UI components (button, dialog, card, etc.)
- 💬 Custom `PixelAlertDialog` with full Material-like API
- 📐 Clean, scalable, and customizable composables
- 🧩 Plug-and-play pixel UI for any Jetpack Compose project

---

## 🚀 Getting Started

### 1. Add the Dependency (Coming Soon)

```kotlin
// settings.gradle.kts
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        // maven("https://jitpack.io") // If hosted via JitPack
    }
}

### 1. Add the Dependency (Coming Soon)
dependencies {
	        implementation("com.github.ashishkr2534:popText:version-number")
	}

```

## 🚀 Sample Examples

### PixelButton Example

```kotlin
PixelButton(
    text = "Click Me",
    onClick = { /* Your Action */ }
)

PixelAlertDialog(
    onDismissRequest = { showDialog = false },
    title = { Text("Delete World?", fontFamily = PixelFamilyBold) },
    text = { Text("Are you sure you want to delete this world?") },
    confirmButton = {
        PixelButton("Delete", onClick = { /* Confirm */ })
    },
    dismissButton = {
        PixelButton("Cancel", onClick = { showDialog = false })
    }
)

MinecraftPixelCard {
    Text("Welcome to Pixel Land", fontFamily = PixelFamilyBold)
}

PixelText("PixelText ")

PixelTextField(value = text,
            onValueChange = {
                text = it
            },
            label = "Label",
            placeholder = "Enter string")

PixelToast(message = "Hello from PixelToast!", show = showToast) {
                showToast = false
            }



```
## ScreenShots
<div style="display: flex; gap: 10px;">
  <img src="https://github.com/user-attachments/assets/99b884c4-efe6-4f6d-92ce-dfa51127ab9a" alt="Glassified UI 1" width="300"/>
  <img src="https://github.com/user-attachments/assets/4e6087ff-3979-4332-9603-eaf6d99c3c47" alt="Glassified UI 2" width="300"/>
    
</div>


##🎨 Theming & Fonts
The library uses custom pixel-style fonts:

PixelFamilyBold

PixelFamilyRegular

You can fully customize components by overriding:

fontSize

colors

modifiers

shapes

elevations


## 👨‍💻 Developed by  
Ashish – Android Developer  
[LinkedIn – ashishkr2534](https://www.linkedin.com/in/ashishkr2534)  
Tech Focus: Jetpack Compose, Kotlin, SwiftUI, System Architecture
