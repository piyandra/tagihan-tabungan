# API Specs

## Search By Name

- Endpoint : GET /api/search

### Query Params :

- name : String, name using like query
- account : String, account using like query

Request Body:

```json
{
  "name" : "Viandra Stefani"
}
```

Response Body (Success):

```json
{
  "data" : {
    "name" : "Viandra Stefani",
    "address" : "Gumiwang RT 06/03",
    "office" : "1075",
    "account" : "117201002156",
    "product" : "210",
    "balance" : "Rp1.500.000"
}
```

Response Body (Error Not Found):
```json
{
  "error" : "Not Found"
}
```
