# Test Cases – AutomationExercise

---

## TC-01 Verify Login Page Loads

Steps:
1. Open browser
2. Navigate to https://automationexercise.com/
3. Click Signup/Login

Expected Result:
Login page should open

## TC-02 Verify Login with valid Credentials

Steps:
1. Navigate to login page
2. Enter valid email
3. Enter valid password
4. Click login

Expected Result:
Login page should open

---

## TC-03 Verify Login with Invalid Credentials

Steps:
1. Navigate to login page
2. Enter invalid email
3. Enter invalid password
4. Click login

Expected Result:
Error message should display

---

## TC-04 Verify Product page Loads

Steps:
1. Login with valid Credentials 
2. click on Products 

Expected Result:
Product page should open and loads all the product 

---

## TC-05 Verify Product Search

Steps:
1. Navigate to products page
2. Enter product name in search
3. Click search 

Expected Result:
user must be able to search the products 
 
---

## TC-06 Verify Product Search

Steps:
1. Navigate to products page
2. Enter product name in search
3. Click search

Expected Result:
Matching products should display
 
---

## TC-08 Verify Product Search

Steps:
1. Navigate to products page
2. Enter product name in search


Expected Result:
Matching products as per the characters entered in the field is listed 
 
---

## TC-09 Verify Add to Cart

Steps:
1. Navigate to products page
2. Click add to cart

Expected Result:
Product should be added to cart
 
 ---

 ## TC-10 Verify user can remove product from cart

Steps:
1. Navigate to products page
2. Click add to cart
3. go to cart page 
4. click on remove product from the cart

Expected Result:
Product should be removed from the  cart 

---


 ## TC-11 Verify user can update the product quantity from the cart page 

Steps:
1. Navigate to products page
2. Click add to cart
3. go to cart page 


Expected Result:
User must be able to Update the Product quantity from the cart page

---

## TS-12 Verify cart price calculation when quantity is increased 

Steps:
1. Navigate to products page
2. Click add to cart
3. Increase the product quantity 
3. go to cart page 

Expected Result:
cart price should be incresed

---

## TS-13 Verify cart price calculation when Quantity is decreased

Steps:
1. Navigate to products page
2. Click add to cart
3. Decrease  the product quantity 
3. go to cart page 

Expected Result:
cart price should be Decreaed 

---


## Ts-14 Verify cart page requires login if user is not logged in before

Steps:
1. Navigate to products page
2. Click add to cart
3. click on Checkout


Expected Result:
check login/Register button is getting displayed for unauthorized users 

---- 

## TS-15 Verify address details is displaying

Steps:
1. Navigate to products page
2. Click add to cart
3. click on Checkout


Expected Result:
valid address details should be displayed 

---- 

## TS-15 Verify address details is displaying

Steps:
1. Navigate to products page
2. Click add to cart
3. click on Checkout


Expected Result:
valid address details should be displayed 

---- 

## Ts-16 Verify successful order placement

Steps:
1. Navigate to product page 
2. add product to the cart
3. click on place order 
4. select address and click on checkout 

Expected Result:
User must be able top place the oprder successfullu

----

## Ts-17 Verify confirmation page after order 

Steps:
1. Navigate to product page 
2. add product to the cart
3. click on place order 
4. select address and click on checkout 

Expected Result: 
confirmation page with the message should be displayed 

----

## Ts-18 Verify in cart page cart table is center alligned  

Steps:
1. Navigate to product page 
2. add product to the cart
3. go to cart page 

Expected Result: 
Cart table content must be centre alligned  

----

## Ts-19 Varify in cart page all the Column names are present  

Steps:
1. Navigate to product page 
2. add product to the cart
3. go to cart page 

Expected Result: 
All the Columns name of the table must be present  

----


## TS-20 Verify user can submit contact us form

Steps:
1. Navigate to Contact us form 
2. fill the form with the details
3. click on submit

Expected Result:
Form should get submitted without any error 

