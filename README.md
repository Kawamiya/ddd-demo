# ddd demo

This project is designed to provide a standard.
> I do not follow design pattern:dependency inversion strictly.

## what's is DDD?
To understand DDD, it's most important to distinguish between anemic model and rich model.
#### anemic model and bulky service
In MVC, we always use anemic model,
an anemic model means that the fields and methods/functions is seperated into different classes.

And all methods/functions is collected into Service classes, also including the converter
methods/functions, valid methods/functions and so on.
#### rich model and thin service
In DDD, what's should we do is to disassemble the service layer of MVC.

We allow the entity to have own methods/functions such as valid method, 
converter method and save/delete method.

For some complex business logic or idea, we can build an aggregate, which may contain several entities.
> For example, we may build several tables to store a blog, including blog body, blog summary, blog comments,
> reference, author info and so on. 
> So a blog actually has many entities.
> 
> Previously when saving a blog, we build a save(BlogDto data) method in BlogService:
> 1. check and valid
> 2. build blog summary according to Dto, save
> 2. build blog body according to Dto, save
> 3. build author info according to Dto, save
> 4. return
> 
> Now in DDD: 
> 1. BlogAggregate aggregate = BlogAggregate.builder(BlogDto data), here the builder() method includes many check processes.
> 2. BlogAggregate.save(aggregate), in this save method, it will call several save methods of entities.
> 3. return

Here we split out the business logic into a single layer, 
and put all the other methods that are not business logic into the domain layer.


## How to design DDD architecture?

#### Infrastructure Layer

This layer is responsible for persistently storing data, 
and we add an ACL between this layer and the domain layer,
because we may use different databases to persist the data.

In this layer, the core component is repository. The repository is responsible for 
save, delete or query entity object.

One Po should correspond to one table in database. The process to query an entity from repository is:
> 1. select one line of a table 
> 2. wrap it into a Po
> 3. convert Po into entity
> 4. return entity

###### directory structure

[//]: # (Todo: generate directory structure)

#### Domain Layer

We will design many entities and aggregates in this layer, in order to implement all non-business logic.

Here we should use design pattern as possible as we can, to improve code maintainability.
> For example:
> Use strategy pattern for check methods ---> eliminate if/else
> Use factory pattern for build methods 

[//]: # (> Todo: add more useful design patterns here.)

#### Application Layer

We only organize and call domain methods to implement business logic in this layer.

We use CQRS here, query methods can call repository directly but command methods should only use domain methods.

The return object can be Entity or Aggregate.

#### Interface Layer

Defining api and assembling Vo here.

We can also do some type valid methods for Dto here by using validation package provided by spring.
