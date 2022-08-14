Feature: HomePage

  Scenario Outline:Validate the links under Megamenu
    Given Automation practice application is opened
    When I hover on mega menu <Menu> and click on <SubMenu>
    Then I should be able to view <SubMenu> page
    Examples:
      | Menu | SubMenu |
      | Dresses | Summer Dresses |
