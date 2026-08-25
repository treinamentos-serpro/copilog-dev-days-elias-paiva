# Soc Ops Agent Guide

## Mandatory development checklist

Before considering a change complete, run all three steps from `socops/`:

- [ ] **Lint:** no lint tool is configured; perform a static review of changed Java, HTML, CSS, and JavaScript.
- [ ] **Build:** `./mvnw clean package`
- [ ] **Test:** `./mvnw test`

## Project shape

- Spring Boot 3.4.2 / Java 21 application in `socops/`; use the Maven Wrapper.
- Thymeleaf serves [game.html](socops/src/main/resources/templates/game.html), whose inline JavaScript mirrors the server board logic.
- Under [com.socops](socops/src/main/java/com/socops/), keep records in `model`, prompts in `data`, pure logic in `service`, and web wiring in `web`.
- There is no persistence. Refresh normally creates a new in-memory board. The app runs on port `8080`; routes are `/` and `/api/bingo/fresh-board`.

## Conventions and pitfalls

- Follow the immutable record/factory patterns in [BingoCell.java](socops/src/main/java/com/socops/model/BingoCell.java) and [WinningStreak.java](socops/src/main/java/com/socops/model/WinningStreak.java).
- Keep [BoardAssembler.java](socops/src/main/java/com/socops/service/BoardAssembler.java) static, side-effect free, and return new lists. The board is fixed at 5x5; id/index `12` is the selected, non-toggleable free cell.
- Prompt order is shuffled, so tests should assert invariants, not exact order. Add focused JUnit 5 tests using the `@DisplayName` style in [BoardAssemblerTests.java](socops/src/test/java/com/socops/service/BoardAssemblerTests.java).
- For board changes, update and validate both `BoardAssembler.java` and its mirrored functions in [game.html](socops/src/main/resources/templates/game.html).
- For UI changes, preserve [app.css](socops/src/main/resources/static/css/app.css) utilities and follow [CSS instructions](.github/instructions/css-utilities.instructions.md) and [frontend design instructions](.github/instructions/frontend-design.instructions.md).

## Design guide (Space Galaxy Glow)

- Treat the visual direction as cinematic dark sci-fi: deep navy backgrounds, cyan/ice accents, warm amber only for victory states.
- Keep theme tokens centralized in [app.css](socops/src/main/resources/static/css/app.css) under `:root`; prefer reusing variables over adding hard-coded colors.
- Preserve existing utility class names when possible; add new utility/composition classes instead of inline styles.
- Prioritize readability on dense tiles: short line-height, strong foreground contrast, and clear selected/winning differentiation.
- Use motion intentionally: quick reveal/feedback animations are preferred; avoid long-running or distracting loops on interactive elements.
- Maintain functional invariants while styling [game.html](socops/src/main/resources/templates/game.html): 5x5 grid integrity, free-cell affordance, and victory visibility hierarchy (tile state, banner, modal).
- Validate both desktop and mobile behavior after UI updates (tap targets, text wrapping, and modal fit).

## References

- Use the [README](README.md) and [workshop guide](workshop/GUIDE.md) for setup and lab context.
- Check [.github/agents/](.github/agents/) and [.github/prompts/](.github/prompts/) before using existing TDD, UI, quiz, or setup workflows; verify the file exists before referring to it.