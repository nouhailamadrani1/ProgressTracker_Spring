# ProgressTracker - Documentation README

## Table of Contents
- [Introduction](#introduction)
- [Context of the Project](#context-of-the-project)
- [Configuration](#configuration)
  - [Creating User and Goal Classes](#creating-user-and-goal-classes)
  - [Configuring Beans](#configuring-beans)
  - [Dependency Injection](#dependency-injection)
  - [Adding Spring Data](#adding-spring-data)


## Introduction

Welcome to the documentation for the "ProgressTracker" project developed for "Geneiryodan Corporate." This application aims to modernize the management of progress and objectives within the company using the Spring framework.

## Context of the Project

"Geneiryodan Corporate" is an IT company that aims to improve the management of progress and objectives within the company. As a member of the development team, your mission is to create a progress tracking application called "ProgressTracker" using Spring.

### Tasks Assigned

#### Creating User and Goal Classes

We have created Java classes for "User" and "Goal." The classes define the following attributes:

- **User**: ID, name, avatar
- **Goal**: ID, description, completion status

#### Configuring Beans

The "User" and "Goal" classes have been configured as Spring beans in the Spring-based XML configuration file (spring-config.xml). The singleton and prototype scopes have been defined for users.

#### Dependency Injection

A service class, "ServiceProgressTracker," has been created to handle the application's logic. Instances of "User" and "Goal" are injected into this class. We have implemented methods to assign goals to users, update their progress, and track achievements using dependency injection.

#### Adding Spring Data

The data source has been configured in your Spring configuration, whether in XML or Java, to store and retrieve data related to progress and goals.

## Configuration

### Creating User and Goal Classes

The "User" and "Goal" classes are already created with the required attributes. You can further customize them to suit your project's needs.

### Configuring Beans

The "User" and "Goal" classes must be configured as Spring beans in a Spring XML configuration file (spring-config.xml). Ensure that the singleton and prototype scopes are correctly defined for users.

### Dependency Injection

The "ServiceProgressTracker" class manages the application's logic. Ensure that instances of "User" and "Goal" are correctly injected into this class. Implement the methods to manage goals and progress.

### Adding Spring Data

Configure the data source in your Spring configuration, either in XML or Java, to store and manage application data.

