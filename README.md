# Order Management System

## Overview

The Order Management System is a Java-based project that handles order processing efficiently. It leverages multithreading to update order statuses automatically and logs each update for tracking purposes.

## Features

Order Processing: Processes new orders and updates their status.

Multithreading Support: Uses a thread pool to handle multiple order updates concurrently.

Logging: Logs order status updates for easy tracking.

##  Components

1. OrderManager.java

Manages order processing and status updates.

Uses an ExecutorService to handle multithreading.

Logs each order update.

2. Order.java

Represents an order with attributes like orderId and status.

Provides methods to retrieve and update order details like customer name , statues , Quntity , etc .

3. StockPredictor.java

Predicts when stock will run out based on average daily sales.

Suggests a restocking strategy.

4. Product.java

Represents a product with attributes such as productId, name, price, stockLevel, and reorderThreshold.
