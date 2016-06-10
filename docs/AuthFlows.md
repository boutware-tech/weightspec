# Authentication and Authorization Flows

Here are some flows for authentication and authorization of various actors in the system.

## Anonymous

1. No login/authentication
2. Read-only access to :
   1. Organizations
   2. Teams
   3. Some *body_measurement* and *weight_loss_plan* data

## Organization Admin

1. Login/authenticate to Identity system
2. Authorization from **Identity system** for read-only access to priviledged Identity system data
3. Authorization from **WeightSpec system** to grant "Approver" permission to other users

## Coach or Team Manager

1. Login/authenticate to Identity system
2. Authorization from **Identity system** for read-only access to priviledged Identity system data
3. Authorization from **WeightSpec system** to :
    1. Create, edit, and delete *body_measurement* records for athletes on that team
    2. Submit weight management *transactions* for that team

## Approver

1. Login/authenticate to Identity system
2. Authorization from **WeightSpec system** to edit and approve or reject *body_measurement* records
3. Authorization from **WeightSpec system** to create *weight_loss_plan* records
