# Evil Pair

It turns out your co-workers [might be evil](http://c2.com/cgi/wiki?CodeForTheMaintainer).

Today we're going to solve a fairly traditional code kata but with an Evil twist. This is a rare dojo where you will need to find a pair, as we are going to have 2 roles in play. You'll need to decide which of you is going to be the **Evil Tester** and which of you will be the **Evil Implementer**.

![Evil](https://media.giphy.com/media/5nFShZWwq3fdm/giphy.gif)

### Evil Tester

Your job as the **Evil Tester** is to write test cases for the problem that attempt to break the **Evil Implementer**'s code. However you can't just write tests to be annoying (`expect(your_object.lol.what_is_this == this).toBe(true)`); they have to actually prove/verify real bugs that can or do exist for the problem in question. In other words your tests must identify blind spots that your implementer has in solving the problem.

### Evil Implementer

Your job as the **Evil Implementer** is to write code that solves the problem, passes **Evil Tester**'s tests, but also tries to force your testers tests to grow. For example, if your **Evil Tester** had written this:

```javascript
expect(foo.frobnicated()).toBe(42);
```

... Then you might have written this:

```javascript
const frobnicated = () => 42; //not actually frobnicating, just passing the test
```

Unlike the [corporate motto for Google](https://en.wikipedia.org/wiki/Don%27t_be_evil), you actually do want to Be Very Evil.

## Constraint

Here's where it gets complicated/interesting.

You can't talk to your pair. At all.

**You must *only* communicate through the code observed**. You cannot use comments to communicate to your pair (in fact, you cannot use comments at all). The honor-system is in play for keeping in spirit with this constraint.

## Side Note

This dojo is of course an experiment. If you find that the **Evil Implementer** role is occupying far more time than the **Evil Tester**, consider switching roles about mid-way through the exercise so that the other person can get equal time and exposure.

## Problem

You are to implement a Priority Queue (max). A Priority Queue is similar to a Queue except that the items fetched off the front of the queue come out in order from largest to smallest. For example:

```javascript
const priority_queue = new PriorityQueue()

priority_queue.length() // => 0

priority_queue.enqueue(10)
priority_queue.enqueue(30)
priority_queue.enqueue(20)
priority_queue.enqueue(50)
priority_queue.enqueue(40)

priority_queue.length() // => 5

priority_queue.dequeue() // => 50
priority_queue.dequeue() // => 40
priority_queue.dequeue() // => 30

priority_queue.length() // => 2

priority_queue.dequeue() // => 20
priority_queue.dequeue() // => 10

priority_queue.length() // => 0
priority_queue.isEmpty()
```

And in fact that is the interface you will be writing:

```javascript
function length() {}
function enqueue(value) {}
function dequeue() {}
function isEmpty() {}
```

Though you do not need to use javascript, of course.

#### Additional rules

* You cannot use an implementation from your language-of-choice's standard library.
* If there is a data structure in your language that can mimic the behaviors, you also cannot use it.
* **You cannot use sorts.**

### Enjoy! :)
