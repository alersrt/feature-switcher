# Feature Switcher

Example of "Feature Toggle" pattern. The main idea is to isolate feature related logic in separated class and store its class path in related storage. For example lets consider the next data model:

```mermaid
erDiagram
erDiagram
    user {
        number id PK
    }
    
    feature {
        number id PK
        string class_path
    }

    user_feature {
        number user_id FK
        number feature_id FK
    }

    user ||--o{ user_feature : user_id
    feature ||--o{ user_feature : feature_id
```
We can easily load needed feature and load related class for using. It's also can be useful for A/B testing, etc.