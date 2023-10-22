# Adapter Pattern

**Plugging Devices into Power Outlets**

You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

_**Adaptee Objects:**_

- Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.

- Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method.

- SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.

_**Target Object:**_

- PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.

_**Adapter Objects:**_

- LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().

- RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().

- SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().

**In your solution you must provide the following in your Github link account:**

  1. Problem statement (description of the problem. Just copy what is stated here.
  2. UML Class Diagram
  3. Uploaded java codes for the solution.

# Adapter Pattern Diagram
![Adapter Pattern](https://github.com/HannahCondada/Adapter-Pattern/assets/142371011/4d946b4b-fe16-4c32-89e0-338b8963268e)
