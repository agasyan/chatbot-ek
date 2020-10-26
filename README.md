# Background

This user story is suggested by a member of teaching team.

# Description

This user story lets a Line user to find a product and
get its price from a product category in EnterKomputer Web site.

# Webservice API

- Data scraping from [EnterKomputer](http://enterkomputer.com/) or via its API
(find the URL in the HTML source used in their products list page)

# Input Specs

- `/enterkomputer CATEGORY NAME`
    - **CATEGORY** is the name of product list section in EnterKomputer
    Web site, e.g. `Processor`, `Motherboard`, `Harddisk`, `SSD`, etc.
    - **NAME** is the name of product, e.g. `Geforce GTX 1080`

# Output Specs

- **N** lines of string where **N** is number of products that matches
with the given **NAME**
    - Each line is written in following format: `PRODUCT - DESCRIPTION - PRICE` where
    **PRODUCT** is the product name (e.g. `iGame Nvidia Geforce GTX 1080`,
    **DESCRIPTION** is the description (e.g. `No. 1 VGA Brand in China`),
    and **PRICE** is the price in Rupiah

# Definition of Done

- [X] Can handle at least 7 product categories in EnterKomputer
- [X] WIP contained in a branch and tracked in GitLab repository
- [X] Created or worked a module specific for containing functionalities related to this user story
- [X] Wrote stubs & unit tests
- [X] Test coverage >= 70%
- [X] Provided error handling for boundary cases and other exceptional cases
- [X] Build passed (i.e. not failed)
- [X] Have tested the working build on Heroku instance




Issue for project: A3