# Spring Boot, PostgreSQL, JPA, Rest API for Cinema web

## Explore Rest APIs

### Movie

| No. | API Name       | HTTP Method | Path                | Status Code   | Description                       |
|---------|----------------|-------------|---------------------|---------------|-----------------------------------|
| 1       | GET Movies  | GET         | `/api/v1/movies` | 200 (OK)      | All Movie resources are fetched|
| 2       | POST Movie  | POST        |`/api/v1/movies`    |201 (Created)  | A new Movie resource is created|
| 3       | GET Movie   | GET         |`/api/v1/movies/{id}`|200 (OK)      | One Movie resource is fetched |
| 4       | PUT Movie   |PUT         |`/api/v1/movies/{id}`|200 (OK)      |Movie resource is updated     |
|5        |DELETE Movie|DELETE      |`/api/v1/movies/{id}`|204(No Content)|Movie resource is deleted     |

### Movie Detail
- **URL**: `/api/v1/movie_detail/likeandcomment/{movieId}`
- **HTTP Method**: `GET`
- **Path Variables**:
  - `{movieId}`: ID của bộ phim (kiểu dữ liệu: `Long`)
- **Response**:
  - Status Code: `200` (OK)
  - Response Body:
    - `movieId`: ID của bộ phim (kiểu dữ liệu: `Long`)
    - `totalLike`: Tổng số lượt thích của bộ phim (kiểu dữ liệu: `int`)
    - `listComment`: Danh sách các comment của bộ phim (kiểu dữ liệu: `List<Comment>`)