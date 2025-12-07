# bei_yetu

## About
This is a collaborative Android app built with Jetpack Compose and Room Database that helps users compare product prices across multiple retailers (Naivas, Carrefour, Quickmart, etc.).

## Features
- User authentication (login/signup/logout)
- Product listing with categories and subcategories
- Search funtionality for products
- Price comparison across different stores
- External store links (opens store websites directly)
- Comment section for user feedback
- Profile page and editting functionalities for this page

## Technologies used
- Kotlin (primary language)
- Jetpack Compose (UI)
- Room Database (local persistence)
- Navigation Component (multi‑screen flows)
- ViewModel + StateFlow (state management)
- Material Design Components (UI styling)

## Demo Pictures
- Sign up and Log in<br>
<img width="343" height="762" alt="image" src="https://github.com/user-attachments/assets/105e0714-8ca1-4870-b1ef-be3fb61f8de5" />


- Home Page and Categories page<br>
- Product details page<br>
- Account Page<br>

## Future Improvements
🔹 **Authentication Enhancements**
- Add secure password storage and validation.
- Integrate social login (Google, Facebook, etc.).
- Support persistent sessions with auto‑login.<br>

🔹 **Product Features**
- Implement product search with filters (price range, category, store).
- Add product ratings and reviews from users.
- Support product favorites/wishlist.<br>

🔹 **Store Integration**
- Fetch live prices via APIs from Naivas, Carrefour, Quickmart (instead of static data).
- Add more retailers for broader comparison.
- Show store availability (in‑stock/out‑of‑stock).<br>

🔹 **UI/UX Improvements**
- Dark mode support.
- Better error handling and user feedback (snackbars, dialogs).
- Accessibility improvements (screen reader support, larger text options).<br>

🔹 **Navigation & Session**
- Smarter start destination (skip login if already authenticated).
- Add profile management (edit name, email, preferences).
- Improve logout flow with confirmation dialogs.<br>

🔹 **Database & Performance**
- Sync product data with a remote backend (Firebase, Supabase, or custom API).
- Cache store links and product images for offline viewing.
- Optimize queries with Room relations and indexing.<br>

🔹 **Community Features**
- Expand comments into threaded discussions.
- Add likes/upvotes for comments.
- Enable reporting inappropriate content.<br>

🔹 **Notifications**
- Push notifications for price drops.
- Alerts when a product is back in stock.
- Personalized recommendations.<br>

🔹 **Testing & Deployment**
- Add unit tests and UI tests.
- Continuous integration (CI/CD) pipeline.
- Publish to Google Play Store.

---

🔹 **Original Repository**
Forked from https://github.com/LMaithya/bei_yetu
