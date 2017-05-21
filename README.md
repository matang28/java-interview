# Fiix Java Interview #

## Welcome ##
This readme file should answer most of your questions, it describes the interview assignment in detail. So read it Carefully!
Please keep your code clean and maintain good documentation as these will also be evaluated as part of the assignment.

* The first step you should do is to clone this repository to your local machine using git.
* After cloning the repository create a branch with your name and checkout to it.
* When you done with the assignment please commit and push your code back to the origin.

## Project Structure ##
This is a simple Maven Java (1.8) project with no external dependencies, you can find the source code inside the src/main/java folder.
In the assignment we will define two entities:

* The User entity - pojo with the user information.
* The Relationship - a relationship between two users.

Inside that folder you will find the following package structure:

    +com.fiixapp
        +data
            - RelationshipDatabase -> The relationship database.
            - UserDatabase -> The user's database.

        +enums
            - Gender - Enum that describes the user's gender.
            - RelationType - Enum that describes a type of relationship between two users.
            - Religion - Enum that describes the user's relationship.

        +models
            - Entity - Abstract entity class.
            - Createable - Abstract entity with creation date class.
            - RelationshipModel - The data model of a relationship.
            - UserModel - The data model of a user.

        +repositories
            +base
                - IRepository - An interface of a repository.
                - BaseUserRepository - Common abstract class to all future repositories.
                - BaseRelationshipRepository - Abstract class to the relationship repository.
                - BaseUserRepository - Abstract class to the user's repository.

## Assignment Number 1 ##
* Create a concrete implementation to the user's repository and name it UserRepository.
* Create a concrete implementation to the relationship repository and name it RelationshipRepository.

## Assignment Number 2 ##
* Create a REST endpoint that will get a user by its id.
* Create a REST endpoint to get all the relationships of a user, the result should be grouped by incoming/outgoing relationships and by the relationship type.
* Create a REST endpoint to add a relationship between two users (for each one of the relationship types).

## Assignment Number 3 ##
One of our key features is to suggest potential dates to other users, in this assignment we will implement a suggestion feature called "Hook-Me":

The user can send his search preferences:
* Age range
* Religion list
* Gender

We will filter the user's database according to the users suggestion and to make a "good" suggestion we will apply the following rules:
* The requester should not get users that blocked him.
* The requester should not get users that he blocked.
* Users that have a Message/Like relationship with the requester should be at the end of the result.
* Users that have a Viewed the requester should be at the top of the list.

Your job is to create a REST controller to handle this request, a good way to start is by extending the repositories and by creating services to handle the business logic.

## Assignment Number 4 ##
The product manager wants to add a new feature that allows the user to post messages to shared wall.
A post contain the creator's identity, the post content (string) and the creation time.
Please create a REST controller to support the following actions:
* Create a new post.
* Delete a post.
* Get all the posts by the user's search preferences (as described in the previous assignment)

## Assignment Number 5 - BONUS ##
As the user database begins to grow up in size we want to implement a cache to the results of the 3rd assignment.
Design, implement and integrate a cache layer to the results of the 3rd assignment endpoint.


Good Luck,
The Fiix gang.