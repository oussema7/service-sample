# Digital Banking Services: Onboarding Service

This module provides an implementation of the customer onboarding service within the digital platform.
It exposes endpoints to the frontend that allows:
- Identify customer in the core bank and check its eligibility
- Create a customer subscription by creating a legal entity and a service agreement (call to `Access Control service`), initializing its approval workflow (`Approval Service`) and asynchronously pull its accounts from the core bank and persist them within `Arrangement manager service` then activate his subscription in the core bank.
- Manage offer packages assigned to the customer (Standard/premium).
- Manage subscriptions (list, update and rescind).
- Track subscriptions creation progress and retry failed ones.

All endpoints are protected using `Spring Security` and perform permission checks on `PreAuthorize`.

### Implementation

- Backbase buildingblocks are used to add `spring boot` and `spring cloud` dependencies to the project.
- `Spring AOP` is used to audit subscription creation progress and track steps status. Retry and rollback mechanisms use steps status to fulfill required actions.
- Custom exceptions are implemented and raised to the frontend.
- Onboarding service integrates with bank client Apis and platform Apis.
- Spring boot Async mode is enabled and used when pulling the accounts information from core bank and persisting them within the platform. 